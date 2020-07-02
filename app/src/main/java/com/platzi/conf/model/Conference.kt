package com.platzi.conf.model
import java.io.Serializable
import java.util.*
class Conference:Serializable{
    lateinit var title: String
    lateinit var description: String
    lateinit var tag: String
    lateinit var dateTime: Date
    lateinit var speaker: String
    override fun toString(): String {
        return "Conference(title='$title', description='$description', tag='$tag', dateTime=$dateTime, speaker='$speaker')"
    }

}