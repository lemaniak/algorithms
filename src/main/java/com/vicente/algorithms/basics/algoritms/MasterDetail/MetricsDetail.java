package com.vicente.algorithms.basics.algoritms.MasterDetail;

/**
 * Created by vicente on 20/03/15.
 */
public class MetricsDetail {

    private int id;
    private Song song;
    private Metric metric;
    private int value;

    public MetricsDetail(int id, Song song, Metric metric, int value) {
        this.id = id;
        this.song = song;
        this.metric = metric;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
