
fun main(){


    var Member: Community =Community(Single(53,45,"mal","roul","bar yohai","31/03/1995",58.0,74,74147.0,14,TypeOfVolontaryAction.MUSICAL))
    //println(Member.listMembers.toString())
    var cm=Married(345,3,554,"MALE","ROULII","KING GEORGES","31/05/1994",414,2,5874,14,TypeOfVolontaryAction.PHYSICAL)
    Member.addMember(cm)
   // println(Member.listMembers.toString())

   // println(Member.TaxAllMembers())
    var Pmo : Community=Community()
    Pmo.addMember(cm)
    Pmo.addMember(Married(345,1,147,"MALE","ROULio","TEL AVIV","31/05/1998",964,14,18000,147,TypeOfVolontaryAction.MUSICAL))
    //println(Pmo.listMembers.toString())
   //
    // println(Pmo.AskOfGmah(cm))
    println(Pmo.listInOrderOfVolountaryHours())
    println(Pmo.listOrderVolontaryHours())


}