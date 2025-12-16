package fecade;

public class FacadeSmithy {

    public void work(String name, boolean make){
        if (make) {
            Forge forge = new Forge();
            forge.work(name);
            if (!Recipes.getRecipes(name, make)){
                if(!forge.search(name))
                    return;
                forge.remove(name);
                forge.working(name);
                System.out.println("The " + name + " ihave been created!!");
            } else {
                System.out.println("It has not been possible to " + forge.ACTION + " the " + name);
            }
        } else {
            WorchBench worchBench = new WorchBench();
            worchBench.working(name);
            if (Recipes.getRecipes(name, make)){
                if (!worchBench.search(name))
                    return;
                worchBench.remove(name);
                worchBench.working(name);
                System.out.println("The " + name + " have been improved!!");
            } else {
                System.out.println("It has not been possible to " + worchBench.ACTION  + " the " + name);
            }
        }
    }
}
