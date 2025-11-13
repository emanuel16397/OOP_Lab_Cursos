package models;

public class Course {
    private String title;
    private int duration;
    private String professor;

    // Constructor con todos los datos
    public Course(String title, int duration, String professor) {
        this.title = title;
        setDuration(duration);
        if (professor == null || professor.isBlank()) {
            this.professor = "Unassigned";
        } else {
            this.professor = professor;
        }
    }

    // Constructor sobrecargado (sin profesor)
    public Course(String title, int duration) {
        this(title, duration, "Unassigned");
    }

    // Getters y setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            this.duration = 0;
        } else {
            this.duration = duration;
        }
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = (professor == null || professor.isBlank()) ? "Unassigned" : professor;
    }

    // Método que puede ser sobreescrito
    public void showInformation() {
        System.out.println("[Course] " + title + " (" + duration + " hs) - Professor: " + professor);
    }
}
