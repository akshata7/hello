package hello

class LoginController {

    def index() { }

    def create(){
        Profile a= new Profile([dEmailid:params.emailid,dPassword:params.password])
        a.save()
        redirect(controller:'login',action:'show')
    }
    def read(){

    }
    def update(){
     def updateinstance = Profile.get(1)
        updateinstance.dEmailid = "abc@gmail.com"
        updateinstance.save()
        render "successfully updated new email is ${updateinstance.dEmailid}"
    }
    def delete(){
            def deleteinstance = Profile.get(1)
            deleteinstance.delete()
               render "successfully deleted"
    }
    def show(){
        // it is to be written in read
        def viewinstance = Profile.get(1)
             println viewinstance.dEmailid
             println viewinstance.dPassword
        render (view: 'show',model:[abc:viewinstance])
    }
}
