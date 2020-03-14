package com.gour.modules;

public class LocationStats {

    private String state;
    private String country;
    private Integer latestTotalCases;
    private int diffFromPreDay;

    public int getDiffFromPreDay() {
        return diffFromPreDay;
    }

    public void setDiffFromPreDay(int diffFromPreDay) {
        this.diffFromPreDay = diffFromPreDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(Integer latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "locationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
