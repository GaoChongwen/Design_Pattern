package piewerTest.Composite;

import produce.AnimalFood;
import produce.CookedFood;
import propComp.PropDir.*;
import propComp.props.landAdaptor.AppleAdaptor;
import propComp.props.landAdaptor.CornAdaptor;

public class Test {
    public static void propDirTest(){
        System.out.println("===============Prop dir test===============");
        System.out.println("====Use prop dir without initialization====");

        // test without initialization
        try{
            Prop.Check("test adaptor");
            Prop.CheckAndRemove(new Node("test node"));
            Prop.CheckAndRemove(new Filer("test filer"));
            System.out.println("initialization test passed");
        }catch(Exception e){
            System.out.println("initialization test not passed");
            e.printStackTrace();
        }

        // add props to the dir
        System.out.println("====Use prop dir without initialization====");
        System.out.println("====add props to the dir");
        System.out.println("initialize at first.");
        Prop.createTree();

        System.out.println("create new adaptors.");
        AppleAdaptor appleAdaptor = new AppleAdaptor();
        CornAdaptor cornAdaptor = new CornAdaptor();

        System.out.println("======then add them to the prop dir========");
        Prop.addAdaptor(appleAdaptor);
        System.out.println("Composite:Prop:addAdaptor:Adaptor added");
        Prop.addAdaptor(cornAdaptor);
        System.out.println("Composite:Prop:addAdaptor:Adaptor added");

        // display the prop dir
        Prop.display(Root.getInstance().propDir);

        // add more products
        System.out.println("=============create new product============");
        AnimalFood animalFood = new AnimalFood();
        System.out.println("Composite:Prop:addProduct:Product added");
        CookedFood cookedFood = new CookedFood();
        System.out.println("Composite:Prop:addProduct:Product added");

        System.out.println("========add product to the prop dir========");
        Prop.addProduct(animalFood);
        Prop.addProduct(cookedFood);
        Prop.display(Root.getInstance().propDir);

        Prop.displayAdaptor();
        Prop.displayProduct();
    }

    public static void main(String args[]){
        propDirTest();
    }
}
