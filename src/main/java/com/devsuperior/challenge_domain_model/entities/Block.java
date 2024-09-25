package com.devsuperior.challenge_domain_model.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

public class Block {

    private Integer id;
    private Instant start;
    private Instant finish;

    private Activity activity;

    public Block() {

    }

    public Block(Integer id, Instant start, Instant finish, Activity activity) {
        this.id = id;
        this.start = start;
        this.finish = finish;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getFinish() {
        return finish;
    }

    public void setFinish(Instant finish) {
        this.finish = finish;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Block block = (Block) o;
        return Objects.equals(id, block.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}