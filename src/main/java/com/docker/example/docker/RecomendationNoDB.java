package com.docker.example.docker;


import java.util.ArrayList;
import java.util.List;

public class RecomendationNoDB {
    private String title;
    private int salary;
    private String description;

    public RecomendationNoDB(String title, int salary, String description) {
        this.title = title;
        this.salary = salary;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }

    public String getDescription() {
        return description;
    }

    public static List<RecomendationNoDB> getRecomendations() {
        List<RecomendationNoDB> recomendations = new ArrayList<>();
        recomendations.add(new RecomendationNoDB("Html-разработчик", 200000, "Межотраслевой центр мониторинга, Москва"));
        recomendations.add(new RecomendationNoDB("C#-разработчик", 160000, "Межотраслевой центр мониторинга, Казань"));
        recomendations.add(new RecomendationNoDB("Javasript-разработчик", 199000, "Межотраслевой центр мониторинга, Самара"));
        recomendations.add(new RecomendationNoDB("Python-разработчик", 200011, "Межотраслевой центр мониторинга, Санкт-Петербург"));
        recomendations.add(new RecomendationNoDB("Javasript-разработчик", 180000, "Межотраслевой центр мониторинга, Санкт-Петербург"));
        recomendations.add(new RecomendationNoDB("Python-разработчик", 170000, "Межотраслевой центр мониторинга, Казань"));

        return recomendations;
    }

}

/*[
        {
        "title":"Java-разработчик",
        "salary":"200000 рублей",
        "description":"Межотраслевой центр мониторинга, Москва"
        },
        {
        "title":"C#-разработчик",
        "salary":"160000 рублей",
        "description":"Межотраслевой центр мониторинга, Казань"
        },
        {
        "title":"Javasript-разработчик",
        "salary":"199000 рублей",
        "description":"Межотраслевой центр мониторинга, Санкт-Петербург"
        },
        {
        "title":"Python-разработчик",
        "salary":"250000 рублей",
        "description":"Межотраслевой центр мониторинга, Самара"
        },
        {
        "title":"Javasript-разработчик",
        "salary":"199000 рублей",
        "description":"Межотраслевой центр мониторинга, Санкт-Петербург"
        },
        {
        "title":"Python-разработчик",
        "salary":"250000 рублей",
        "description":"Межотраслевой центр мониторинга, Самара"
        }
        ]*/
