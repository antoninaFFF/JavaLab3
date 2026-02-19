package by.antonina;

import by.antonina.entities.Character;
import by.antonina.entities.EmotionType;
import by.antonina.entities.location.DefensiveType;
import by.antonina.entities.location.Fortress;
import by.antonina.entities.location.Grotto;
import by.antonina.entities.thing.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thing> fortressItems = new ArrayList<>();
        List<Thing> grottoItems = new ArrayList<>();

        Fortress fortress = new Fortress("моя крепость", true, fortressItems, true, false, DefensiveType.WALL);
        Grotto grotto = new Grotto("восхитительный, хотя и совершенно темный, грот", true, grottoItems, true, true);
        Gun huntingGun1 = new Gun("охотничье ружье", 3, false, false, 12, WeaponType.GUN);
        Gun huntingGun2 = new Gun("охотничье ружье", 3, false, false, 12, WeaponType.GUN);
        Gun huntingGun3 = new Gun("охотничье ружье", 3, false, false, 12, WeaponType.GUN);
        List<Musket> allMuskets = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            allMuskets.add(new Musket("мушкет", 5, false, false, 18));
        }
        Ammunition gunpowder = new Ammunition("порох", 10, true, 100);
        fortress.addItem(huntingGun1);
        fortress.addItem(huntingGun2);
        fortress.addItem(huntingGun3);
        for (Musket musket : allMuskets) {
            fortress.addItem(musket);
        }
        fortress.addItem(gunpowder);
        List<Musket> musketsOnWall = allMuskets.subList(0, 5);
        for (Musket musket : musketsOnWall) {
            musket.load();
            musket.mountOnLafet();
            fortress.getOuterWall().mountWeapon(musket);
            fortress.removeItem(musket);
        }
        List<Thing> characterInventory = new ArrayList<>();
        Character narrator = new Character("Я", characterInventory, fortress);
        System.out.println("Я находился в " + grotto.getName() + " с сухим и ровным дном, покрытым мелким песком.");
        System.out.print("Нигде никаких признаков плесени или сырости; ");
        System.out.println("нигде ни следа отвратительных насекомых и ядовитых гадов.");
        narrator.feelEmotion(EmotionType.CLEAN);
        System.out.print("Единственное неудобство - узкий ход, но для меня это неудобство было преимуществом, ");
        System.out.println("так как я хлопотал о безопасном убежище, а безопаснее этого трудно было сыскать.");
        narrator.feelEmotion(EmotionType.SAFE);
        System.out.println("Я был в восторге от своего открытия!");
        narrator.feelEmotion(EmotionType.DELIGHTFUL);
        System.out.print("\nЯ решил, не откладывая, перенести в мой грот все те свои вещи, ");
        System.out.println("которыми я особенно дорожил, и прежде всего порох и все запасное оружие,");
        System.out.print("а именно: два охотничьих ружья (всех ружей у меня было три) ");
        System.out.println("и три из восьми находившихся в моем распоряжении мушкетов.");
        List<Thing> itemsToMove = Arrays.asList(gunpowder, huntingGun1, huntingGun2, allMuskets.get(5), allMuskets.get(6), allMuskets.get(7)
        );
        narrator.decideToMoveItems(itemsToMove, fortress, grotto);
        System.out.println("\nТретье охотничье ружье я оставил в крепости - оно могло пригодиться.");
        System.out.println("\nТаким образом в моей крепости осталось только пять мушкетов,");
        System.out.print("которые у меня всегда были заряжены и стояли на лафетах, как пушки, ");
        System.out.print("у моей наружной ограды, но всегда были к моим услугам, ");
        System.out.println("если я собирался в какой-нибудь поход.");

        System.out.println("\nЯ с удовлетворением оглядел свои владения:");
        System.out.print("  - На стене крепости пять заряженных мушкетов");
        if (!fortress.getOuterWall().getMountedWeapons().isEmpty()) {
            boolean allLoaded = true;
            for (Weapon weapon : fortress.getOuterWall().getMountedWeapons()) {
                if (!weapon.isLoaded()) {
                    allLoaded = false;
                    break;
                }
            }
            if (allLoaded) {
                System.out.println(" (все заряжены и готовы к бою)");
                narrator.feelEmotion(EmotionType.CONFIDENT);
            }
        }
        System.out.println("\nА в моем новом убежище, в " + grotto.getName() + ",");
        System.out.println("теперь надежно укрыты самые ценные припасы:");
        for (Thing item : grotto.getContainedItems()) {
            if (item instanceof Gun) {
                System.out.println("  - два " + item.getName() + " (охотничьи)");
                break;
            }
        }
        int musketCount = 0;
        for (Thing item : grotto.getContainedItems()) {
            if (item instanceof Musket) {
                musketCount++;
            }
        }
        System.out.println("  - три запасных мушкета");
        System.out.println("  - весь мой порох");
        narrator.feelEmotion(EmotionType.SAFE);
        System.out.println("\nЯ огляделся вокруг и почувствовал, как спокойствие разливается по душе.");
        System.out.println("Узкий ход, который мог бы стать проблемой для другого, для меня стал надежной защитой.");
        System.out.println("Теперь я знал: мои сокровища в безопасности, а я сам - тем более.");
        System.out.println("\nЯ был в полной безопасности и несказанно доволен своим решением.");
        narrator.feelEmotion(EmotionType.PROUD);
        narrator.feelEmotion(EmotionType.PEACEFUL);
        System.out.println("\nТак закончился этот памятный день, когда я нашел идеальное убежище");
        System.out.println("и предусмотрительно переместил туда самое ценное.");
        System.out.println("Отныне у меня было два надежных места: крепость для обороны и грот для хранения сокровищ.");
        System.out.println("И никакие отвратительные насекомые, ядовитые гады или непрошеные гости не могли");
        System.out.println("нарушить мой покой в этом восхитительном убежище.");
    }
}