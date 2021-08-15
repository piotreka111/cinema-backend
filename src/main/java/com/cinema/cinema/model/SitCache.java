package com.cinema.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class SitCache {
    private static final List<Sit> data = new ArrayList<>();

    static {
        int k = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                data.add(new Sit(k++, i, SitStatus.FREE));
            }
        }
    }

    public static List<Sit> getSits() {
        return data;
    }

    public static Sit getSit(long id) {
        return data.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static void updateSit(long id, SitStatus status) {
        Sit sit = getSit(id);
        if (sit != null) {
            sit.setSitStatus(status);
        }
    }
}
