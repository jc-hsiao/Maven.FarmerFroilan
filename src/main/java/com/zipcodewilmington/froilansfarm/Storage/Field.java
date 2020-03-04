package com.zipcodewilmington.froilansfarm.Storage;

import java.util.ArrayList;

public class Field {

    ArrayList<CropRow> field;

    public Field() {
        this.field = new ArrayList<>();
    }

    public void addCropRow(CropRow cropRow) {
        field.add(cropRow);
    }

    public CropRow getCropRow(Integer numberCropRow) {
        for (CropRow element : field) {
            if (element.equals(numberCropRow)) {
                return element;
            }
        }
        return null;
    }

    public Integer getFieldSize() {
        return field.size();
    }

    public void setField(ArrayList<CropRow> field) {
        this.field = field;
    }
}
