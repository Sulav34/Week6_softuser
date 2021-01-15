package com.sulav.softuserreplica

import com.sulav.softuserreplica.model.Student

interface Communicator {
    fun passData(lstStd: ArrayList<Student>)
}