fun main(args: Array<String>) {
    var number=5
    if(number<48){
        println("You dont qualify")
    }else{
        println("You qualify")
    }
    var marks=75
    if (marks>=0 && marks<=20){
        print("You have failed")
    }else if (marks>=60 && marks<=70 ){
        println("Nice trial")
    }else if(marks>=75 && marks<80 )
        println("Passed")
    else{
        println("Above the pass mark you qualify")
    }

}