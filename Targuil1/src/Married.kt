class Married(
    _IdConjoint: Int,
    _NumOfChildrenUnder18: Int,
    Id: Int,
    Gender: String,
    Name: String,
    Address: String,
    DateOfBirth: String,
    NumOfThoraPerWeek: Int,
    NumOfWork: Int,
    Salary: Int,
    PossibilityOdGmah: Int,
    typeOfVolontaryAction: TypeOfVolontaryAction
) : CommunityMember(
    Id,
    Gender,
    Name,
    Address,
    DateOfBirth,
    NumOfThoraPerWeek.toDouble(),
    NumOfWork,
    Salary.toDouble(),
    PossibilityOdGmah,
    typeOfVolontaryAction
) {
    var IdConjoint : Int private set

    var NumOfChildrenUnder18 :Int private set
    init {
        this.IdConjoint=_IdConjoint
        this.NumOfChildrenUnder18=_NumOfChildrenUnder18
    }
    override fun AmountCommunityTax(_NumOfThoraPerWeek: Double,_Salary: Double): Double {
        return _Salary/_NumOfThoraPerWeek

    }

    override fun MaximumAmountFromGmah(_Salary: Int): Int {
        return _Salary/25
    }

    override fun RecommendedVolunteerHours(): Int {
        return 120
    }


}