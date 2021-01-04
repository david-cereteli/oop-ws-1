public class Range {
    private int start;
    private int end;

    public Range() {
    }

    public Range(int start, int end) {
        if (start <= end) {
            this.start = start;
            this.end = end;
        } else {
            this.start = end;
            this.end = start;
        }
    }

    public int getLength() {
        return end - start;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        if (start <= this.end) {
            this.start = start;
        }
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        if (this.start <= end) {
            this.end = end;
        }
    }

    @Override
    public String toString() {
        return String.format("Start: %d End: %d Length:%d", getStart(), getEnd(), getLength());
    }
}
