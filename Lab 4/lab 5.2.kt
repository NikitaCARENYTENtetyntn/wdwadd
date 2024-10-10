enum class BloodGroup {
    A, B, AB, O
}

fun transfusionCompatibility(bloodGroup: BloodGroup): Set<BloodGroup> {
    return when (bloodGroup) {
        BloodGroup.A -> setOf(BloodGroup.A, BloodGroup.O)
        BloodGroup.B -> setOf(BloodGroup.B, BloodGroup.O)
        BloodGroup.AB -> setOf(BloodGroup.A, BloodGroup.B, BloodGroup.AB, BloodGroup.O)
        BloodGroup.O -> setOf(BloodGroup.O)
    }
}

fun main() {
    val bloodGroupInput = readLine()!!.toUpperCase()
    val bloodGroup = BloodGroup.valueOf(bloodGroupInput)
    val compatibleGroups = transfusionCompatibility(bloodGroup)
    for (group in compatibleGroups) {
        println("Группа $group может получать кровь группы $group")
    }
}
