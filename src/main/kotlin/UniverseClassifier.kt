// Class to classify the creatures
class UniverseClassifier {
    val universes = mutableListOf(
        Universe("starWars"),
        Universe("marvel"),
        Universe("hitchHiker"),
        Universe("rings")
    )

    private fun isWookie(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Kashyyyk || creature.planet == null) &&
                (creature.age in 0..400 || creature.age == null) &&
                (creature.traits == null || Traits.HAIRY in creature.traits || Traits.TALL in creature.traits)
    }

    private fun isEwok(creature: Creature): Boolean {
        return (creature.isHumanoid == false || creature.isHumanoid == null) &&
                (creature.planet == Planet.Endor || creature.planet == null) &&
                (creature.age in 0..60 || creature.age == null) &&
                (creature.traits == null || Traits.HAIRY in creature.traits || Traits.SHORT in creature.traits)
    }

    private fun isAsgardian(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Asgard || creature.planet == null) &&
                (creature.age in 0..5000 || creature.age == null) &&
                (creature.traits == null || Traits.BLONDE in creature.traits || Traits.TALL in creature.traits)
    }

    private fun isBetelgeusian(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Betelgeuse || creature.planet == null) &&
                (creature.age in 0..100 || creature.age == null) &&
                (creature.traits == null || Traits.EXTRA_ARMS in creature.traits || Traits.EXTRA_HEAD in creature.traits)
    }

    private fun isVogon(creature: Creature): Boolean {
        return (creature.isHumanoid == false || creature.isHumanoid == null) &&
                (creature.planet == Planet.Vogsphere || creature.planet == null) &&
                (creature.age in 0..200 || creature.age == null) &&
                (creature.traits == null || Traits.BULKY in creature.traits || Traits.GREEN in creature.traits)
    }

    private fun isElf(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Earth || creature.planet == null) &&
                (creature.traits == null || Traits.BLONDE in creature.traits || Traits.POINTY_EARS in creature.traits)
    }

    private fun isDwarf(creature: Creature): Boolean {
        return (creature.isHumanoid == true || creature.isHumanoid == null) &&
                (creature.planet == Planet.Earth || creature.planet == null) &&
                (creature.age in 0..200 || creature.age == null) &&
                (creature.traits == null || Traits.SHORT in creature.traits || Traits.BULKY in creature.traits)
    }

    fun classify(creatures: MutableList<Creature>) {
        for (creature in creatures) {
            when {
                isWookie(creature) || isEwok(creature) -> universes[0].individuals.add(creature)
                isAsgardian(creature) -> universes[1].individuals.add(creature)
                isBetelgeusian(creature) || isVogon(creature) -> universes[2].individuals.add(creature)
                isElf(creature) || isDwarf(creature) -> universes[3].individuals.add(creature)
            }
        }
    }
}