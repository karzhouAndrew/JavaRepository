
package lab22;


public class Lab22 {
    private int sec = 0;
    private int hour = 0;
    private int min = 0;
    private int info = 0;


    public Lab22(int sec) {
        this.sec = sec;
    }

    public Lab22(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getInfo() {
        info = sec + min * 60 + hour * 60;
        return info;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;

    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lab22 that = (Lab22) o;

        if (sec != that.sec) return false;
        if (hour != that.hour) return false;
        if (min != that.min) return false;
        return info == that.info;

    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lab22{");
        sb.append("sec=").append(sec);
        sb.append(", hour=").append(hour);
        sb.append(", min=").append(min);
        sb.append(", info=").append(info);
        sb.append('}');
        return sb.toString();
    }
}
