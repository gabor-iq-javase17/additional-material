package com.example;

public class Peach extends BaseFruit {
    private String variety;

    public Peach(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public void peel() {
        System.out.println("Peeling a peach");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting a peach");
    }

    @Override
    public void eat() {
        System.out.println("Eating a peach");
    }

    @Override
    public String toString() {
        return "Peach{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Peach other = (Peach) obj;
        if (getName() == null) {
            if (other.getName() != null) {
                return false;
            }
        } else {
            if (!getName().equals(other.getName())) {
                return false;
            }
        }
        if (!getName().equals(other.getName())) {
            return false;
        }
        if (getColor() == null) {
            if (other.getColor() != null) {
                return false;
            }
        } else {
            if (!getColor().equals(other.getColor())) {
                return false;
            }
        }
        if (!getColor().equals(other.getColor())) {
            return false;
        }
        if (variety == null) {
            if (other.variety != null) {
                return false;
            }
        } else {
            if (!variety.equals(other.variety)) {
                return false;
            }
        }
        if (!variety.equals(other.variety)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((variety == null) ? 0 : variety.hashCode());
        return result;
    }

}
