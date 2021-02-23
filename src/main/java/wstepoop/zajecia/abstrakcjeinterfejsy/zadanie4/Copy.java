package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie4;

public abstract class Copy {

    protected String title;
    protected int pageCount;

    public Copy(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return title + " - " + pageCount;
    }
}
