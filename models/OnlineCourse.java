package models;

public class OnlineCourse extends Course {
    private String platform;

    public OnlineCourse(String title, int duration, String professor, String platform) {
        super(title, duration, professor);
        this.platform = platform;
    }

    public OnlineCourse(String title, int duration, String platform) {
        super(title, duration);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public void showInformation() {
        System.out.println("[Online] " + getTitle() + " (" + getDuration() + " hs) - Professor: "
                + getProfessor() + " - Platform: " + platform);
    }
}
