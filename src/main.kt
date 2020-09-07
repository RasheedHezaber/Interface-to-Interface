interface  click {

    fun onclick()


    interface secondclass : click {

        fun add()

    }

    class teacher : secondclass {
        override fun add() {
            TODO("Not yet implemented")
        }

        override fun onclick() {
            TODO("Not yet implemented")
        }


    }
}