package oop.hus.lab11.abstractfactory.exercise2;

public class FurnitureFactory {
    private FurnitureFactory() {

    }

    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case FLASTIC:
                return new PlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}


