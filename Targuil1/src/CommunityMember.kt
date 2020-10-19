import java.lang.IllegalArgumentException

abstract class CommunityMember (
    _Id: Int,
    _Gender: String,
    _Name: String,
    _Address: String,
    _DateOfBirth: String,
    _NumOfThoraPerWeek: Double,
    _NumOfWork: Int,
    _Salary: Double,
    _PossibilityOdGmah: Int,
    _typeOfVolontaryAction: TypeOfVolontaryAction) : DutiesObligations {

    var Id:Int private set
    var Gender:String  private set
    var Name: String  private set
    var Address: String private set
    var DateOfBirth:String private set
    var NumOfThoraPerWeek:Double  private set
    var NumOfWork:Int private set
    var Salary:Double private set
    var PossibilityOdGmah:Int private set
    var typeOfVolontaryAction: TypeOfVolontaryAction private set

    init {
        if (_NumOfThoraPerWeek<7 ){
            throw IllegalArgumentException("you learn under 7 hours per week, you are a Batlan sorry")
        }
        if( _NumOfWork +_NumOfThoraPerWeek<112){
            throw IllegalArgumentException("you are a batlan because you don't work or learn enought!")
        }
        this.Id=_Id
        this.Gender=_Gender
        this.Name=_Name
        this.Address=_Address
        this.DateOfBirth=_DateOfBirth
        this.NumOfThoraPerWeek=_NumOfThoraPerWeek
        this.NumOfWork=_NumOfWork
        this.Salary=_Salary
        this.PossibilityOdGmah=_PossibilityOdGmah
        this.typeOfVolontaryAction=_typeOfVolontaryAction

    }

    override fun toString(): String {
        return "(Id=$Id,\n Gender='$Gender',\n Name='$Name',\n Address='$Address',\n DateOfBirth='$DateOfBirth',\n NumOfThoraPerWeek=$NumOfThoraPerWeek,\n NumOfWork=$NumOfWork,\n Salary=$Salary,\n PossibilityOdGmah=$PossibilityOdGmah,\n typeOfVolontaryAction=$typeOfVolontaryAction)\n\n"
    }


}