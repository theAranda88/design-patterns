package abstractfactory.weapon;

public class WizardStaff implements Weapon {

    @Override
    public void damage() {
        System.out.println("Wizard Staff damage");
    }
}
