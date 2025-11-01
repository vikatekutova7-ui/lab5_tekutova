package world

import java.lang.invoke.TypeDescriptor

enum class QuestType(val descriptor: String) {
    DELIVERY(descriptor = "доставка предмета"),
    ELIMINATION(descriptor = "Устранение противника"),
    ESCORT(descriptor = "Сопровождение персонажа"),
    EXPLORE(descriptor = "Исследование новой территории"),
    BOSSFIGHT(descriptor = "Битва с боссом")
}