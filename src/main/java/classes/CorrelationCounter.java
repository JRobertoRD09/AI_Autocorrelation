package classes;

class CorrelationCounter {
    private int totalRequest;
    private int totalCorrelations;
    private int step;

    public CorrelationCounter() {
        this.totalRequest = 1;
        this.totalCorrelations = 0;
        this.step = 0;
    }

    public void reset() {
        this.totalCorrelations = 0;
        this.step = 0;
    }

    public int getTotalRequest() {
        return totalRequest;
    }

    public void setTotalRequest(int totalRequest) {
        this.totalRequest = totalRequest;
    }

    public int getTotalCorrelations() {
        return totalCorrelations;
    }

    public void setTotalCorrelations(int totalCorrelations) {
        this.totalCorrelations = totalCorrelations;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
