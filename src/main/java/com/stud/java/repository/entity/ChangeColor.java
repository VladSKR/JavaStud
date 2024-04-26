package com.stud.java.repository.entity;
import com.stud.java.enums.Color;

import java.util.List;

public class ChangeColor {
            public static void changeColor(List<CatEntity> cats, Color newColor) {
                for (CatEntity cat : cats) {
                    cat.setColor(newColor);
                }
            }
        }

