class Single(
    _NumberYearsLearning: Int,
    Id: Int,
    Gender: String,
    Name: String,
    Address: String,
    DateOfBirth: String,
    NumOfThoraPerWeek: Double,
    NumOfWork: Int,
    Salary: Double,
    PossibilityOdGmah: Int,
    typeOfVolontaryAction: TypeOfVolontaryAction
):CommunityMember(
    Id,
    Gender,
    Name,
    Address,
    DateOfBirth,
    NumOfThoraPerWeek,
    NumOfWork,
    Salary,
    PossibilityOdGmah,
    typeOfVolontaryAction)
{
    var YearsLearning:Int private set
    init {
        this.YearsLearning=_NumberYearsLearning
    }
    override fun AmountCommunityTax(_NumOfThoraPerWeek: Double,_Salary: Double): Double {
        return _Salary/_NumOfThoraPerWeek

    }

    override fun MaximumAmountFromGmah(_Salary: Int): Int {
        return 0
    }

    override fun RecommendedVolunteerHours(): Int {
        return 120
    }


}