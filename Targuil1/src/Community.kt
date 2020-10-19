class Community(vararg communityMember: CommunityMember) {
    var listMembers = mutableListOf<CommunityMember>()

    fun addMember(cm: CommunityMember) {
        this.listMembers.add(cm)
    }

    fun TaxAllMembers() :Double{
        var sum: Double= 0.0
        for (cm in listMembers) {
            sum += cm.AmountCommunityTax(cm.NumOfThoraPerWeek, cm.Salary)
        }
            return sum

    }

    fun AskOfGmah(cm:CommunityMember):Double{
        if(cm.Salary>7500)
            return 0.0
        else(return cm.NumOfThoraPerWeek*cm.Salary)
    }
    fun listInOrderOfVolountaryHours(): Map<TypeOfVolontaryAction, List<CommunityMember>> {
        return listMembers.groupBy{it.typeOfVolontaryAction }
    }
    fun listOrderVolontaryHours(): Map<Int, List<CommunityMember>> {
        return listMembers.groupBy{communityMember: CommunityMember ->communityMember.RecommendedVolunteerHours()  }
    }



    init {
        for(cm in  communityMember){
            this.listMembers.add(cm)
            this.TaxAllMembers()
            this.AskOfGmah(cm)
            this.listInOrderOfVolountaryHours()
            this.listOrderVolontaryHours()
        }

    }

}



