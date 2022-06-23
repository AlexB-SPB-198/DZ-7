public class Medic extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил способность quick treatment");

    }
}
