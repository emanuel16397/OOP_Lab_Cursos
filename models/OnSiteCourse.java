package models;

public class OnSiteCourse extends Course {
    private String room;
    private int maxQuota;

    public OnSiteCourse(String title, int duration, String professor, String room, int maxQuota) {
        super(title, duration, professor);
        this.room = room;
        setMaxQuota(maxQuota);
    }

    public OnSiteCourse(String title, int duration, String room, int maxQuota) {
        super(title, duration);
        this.room = room;
        setMaxQuota(maxQuota);
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(int maxQuota) {
        if (maxQuota < 0) {
            this.maxQuota = 0;
        } else {
            this.maxQuota = maxQuota;
        }
    }

    @Override
    public void showInformation() {
        System.out.println("[On Site] " + getTitle() + " (" + getDuration() + " hs) - Professor: "
                + getProfessor() + " - Room: " + room + ", Quota: " + maxQuota);
    }
}
