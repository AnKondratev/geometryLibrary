package frank;

import org.example.GeometricFigure;

public class GeometryUtils {
    public String FrankensteinsFun(GeometricFigure... figures) {
        if (figures.length < 2) {
            return "Мне нужно хотя бы две фигуры, чтобы провести эксперименты!";
        }

        for (int i = 0; i < figures.length; i++) {
            for (int j = i + 1; j < figures.length; j++) {
                if (figures[i].getClass() == figures[j].getClass()) {
                    return "Я не могу сшить ничего, они одинаковые :(";
                }
            }
        }

        String combinedName;

        String name1 = figures[0].getClass().getSimpleName();
        String name2 = figures[1].getClass().getSimpleName();
        if (figures.length == 2) {
            combinedName = combine2Names(name1, name2);
        } else {
            String name3 = figures[2].getClass().getSimpleName();
            combinedName = combine3Names(name1, name2, name3);
        }

        return combinedName + "! HEEEE'S ALIVE!";
    }

    private String combine2Names(String name1, String name2) {
        if (name1.equals("Circle") && name2.equals("Rectangle") || name1.equals("Rectangle") && name2.equals("Circle")) {
            return "Circtangle";
        } else if (name1.equals("Circle") && name2.equals("Triangle") || name1.equals("Triangle") && name2.equals("Circle")) {
            return "Circlangle";
        } else if (name1.equals("Rectangle") && name2.equals("Triangle") || name1.equals("Triangle") && name2.equals("Rectangle")) {
            return "Rectanglangle";
        }
        return name1 + name2;
    }

    private String combine3Names(String name1, String name2, String name3) {
        String combinedName = name1 + name2 + name3;

        if ((name1.equals("Circle") && name2.equals("Rectangle") || name1.equals("Rectangle") && name2.equals("Circle")) && name3.equals("Triangle")) {
            return "Circlangle";
        } else if ((name1.equals("Circle") && name2.equals("Triangle") || name1.equals("Triangle") && name2.equals("Circle")) && name3.equals("Rectangle")) {
            return "Circtangle"; // Если первая пара - круг и треугольник, а третья - прямоугольник
        } else if ((name1.equals("Rectangle") && name2.equals("Triangle") || name1.equals("Triangle") && name2.equals("Rectangle")) && name3.equals("Circle")) {
            return "Rectanglangle";
        }
        return combinedName;
    }
}

