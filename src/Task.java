public class Task {
    private final String description;
    private boolean completed;

    /**
     * Creates a task with the given description.
     *
     * @param description the task description; must not be null or blank
     * @throws IllegalArgumentException if the description is null or blank
     */
    public Task(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        this.description = description.trim();
        this.completed = false;
    }

    public void markAsCompleted() {
        completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return (completed ? "[✓] " : "[ ] ") + description;
    }
}