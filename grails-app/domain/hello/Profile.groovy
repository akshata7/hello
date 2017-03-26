package hello

class Profile {
    String dEmailid
    String dPassword

    static constraints = {
        dEmailid blank:false,nullable:false
        dPassword blank:false,nullable:false
    }
}
