package com.example.dogbreed.model.DogBreedList


import com.google.gson.annotations.SerializedName

data class MessageModel<AnyModel>(
    @SerializedName("affenpinscher")
    val affenpinscher: List<AnyModel?>? = listOf(),
    @SerializedName("african")
    val african: List<AnyModel?>? = listOf(),
    @SerializedName("airedale")
    val airedale: List<AnyModel?>? = listOf(),
    @SerializedName("akita")
    val akita: List<AnyModel?>? = listOf(),
    @SerializedName("appenzeller")
    val appenzeller: List<AnyModel?>? = listOf(),
    @SerializedName("australian")
    val australian: List<String?>? = listOf(),
    @SerializedName("basenji")
    val basenji: List<AnyModel?>? = listOf(),
    @SerializedName("beagle")
    val beagle: List<AnyModel?>? = listOf(),
    @SerializedName("bluetick")
    val bluetick: List<AnyModel?>? = listOf(),
    @SerializedName("borzoi")
    val borzoi: List<AnyModel?>? = listOf(),
    @SerializedName("bouvier")
    val bouvier: List<AnyModel?>? = listOf(),
    @SerializedName("boxer")
    val boxer: List<AnyModel?>? = listOf(),
    @SerializedName("brabancon")
    val brabancon: List<AnyModel?>? = listOf(),
    @SerializedName("briard")
    val briard: List<AnyModel?>? = listOf(),
    @SerializedName("buhund")
    val buhund: List<String?>? = listOf(),
    @SerializedName("bulldog")
    val bulldog: List<String?>? = listOf(),
    @SerializedName("bullterrier")
    val bullterrier: List<String?>? = listOf(),
    @SerializedName("cattledog")
    val cattledog: List<String?>? = listOf(),
    @SerializedName("chihuahua")
    val chihuahua: List<AnyModel?>? = listOf(),
    @SerializedName("chow")
    val chow: List<AnyModel?>? = listOf(),
    @SerializedName("clumber")
    val clumber: List<AnyModel?>? = listOf(),
    @SerializedName("cockapoo")
    val cockapoo: List<AnyModel?>? = listOf(),
    @SerializedName("collie")
    val collie: List<String?>? = listOf(),
    @SerializedName("coonhound")
    val coonhound: List<AnyModel?>? = listOf(),
    @SerializedName("corgi")
    val corgi: List<String?>? = listOf(),
    @SerializedName("cotondetulear")
    val cotondetulear: List<AnyModel?>? = listOf(),
    @SerializedName("dachshund")
    val dachshund: List<AnyModel?>? = listOf(),
    @SerializedName("dalmatian")
    val dalmatian: List<AnyModel?>? = listOf(),
    @SerializedName("dane")
    val dane: List<String?>? = listOf(),
    @SerializedName("deerhound")
    val deerhound: List<String?>? = listOf(),
    @SerializedName("dhole")
    val dhole: List<AnyModel?>? = listOf(),
    @SerializedName("dingo")
    val dingo: List<AnyModel?>? = listOf(),
    @SerializedName("doberman")
    val doberman: List<AnyModel?>? = listOf(),
    @SerializedName("elkhound")
    val elkhound: List<String?>? = listOf(),
    @SerializedName("entlebucher")
    val entlebucher: List<AnyModel?>? = listOf(),
    @SerializedName("eskimo")
    val eskimo: List<AnyModel?>? = listOf(),
    @SerializedName("finnish")
    val finnish: List<String?>? = listOf(),
    @SerializedName("frise")
    val frise: List<String?>? = listOf(),
    @SerializedName("germanshepherd")
    val germanshepherd: List<AnyModel?>? = listOf(),
    @SerializedName("greyhound")
    val greyhound: List<String?>? = listOf(),
    @SerializedName("groenendael")
    val groenendael: List<AnyModel?>? = listOf(),
    @SerializedName("havanese")
    val havanese: List<AnyModel?>? = listOf(),
    @SerializedName("hound")
    val hound: List<String?>? = listOf(),
    @SerializedName("husky")
    val husky: List<AnyModel?>? = listOf(),
    @SerializedName("keeshond")
    val keeshond: List<AnyModel?>? = listOf(),
    @SerializedName("kelpie")
    val kelpie: List<AnyModel?>? = listOf(),
    @SerializedName("komondor")
    val komondor: List<AnyModel?>? = listOf(),
    @SerializedName("kuvasz")
    val kuvasz: List<AnyModel?>? = listOf(),
    @SerializedName("labradoodle")
    val labradoodle: List<AnyModel?>? = listOf(),
    @SerializedName("labrador")
    val labrador: List<AnyModel?>? = listOf(),
    @SerializedName("leonberg")
    val leonberg: List<AnyModel?>? = listOf(),
    @SerializedName("lhasa")
    val lhasa: List<AnyModel?>? = listOf(),
    @SerializedName("malamute")
    val malamute: List<AnyModel?>? = listOf(),
    @SerializedName("malinois")
    val malinois: List<AnyModel?>? = listOf(),
    @SerializedName("maltese")
    val maltese: List<AnyModel?>? = listOf(),
    @SerializedName("mastiff")
    val mastiff: List<String?>? = listOf(),
    @SerializedName("mexicanhairless")
    val mexicanhairless: List<AnyModel?>? = listOf(),
    @SerializedName("mix")
    val mix: List<AnyModel?>? = listOf(),
    @SerializedName("mountain")
    val mountain: List<String?>? = listOf(),
    @SerializedName("newfoundland")
    val newfoundland: List<AnyModel?>? = listOf(),
    @SerializedName("otterhound")
    val otterhound: List<AnyModel?>? = listOf(),
    @SerializedName("ovcharka")
    val ovcharka: List<String?>? = listOf(),
    @SerializedName("papillon")
    val papillon: List<AnyModel?>? = listOf(),
    @SerializedName("pekinese")
    val pekinese: List<AnyModel?>? = listOf(),
    @SerializedName("pembroke")
    val pembroke: List<AnyModel?>? = listOf(),
    @SerializedName("pinscher")
    val pinscher: List<String?>? = listOf(),
    @SerializedName("pitbull")
    val pitbull: List<AnyModel?>? = listOf(),
    @SerializedName("pointer")
    val pointer: List<String?>? = listOf(),
    @SerializedName("pomeranian")
    val pomeranian: List<AnyModel?>? = listOf(),
    @SerializedName("poodle")
    val poodle: List<String?>? = listOf(),
    @SerializedName("pug")
    val pug: List<AnyModel?>? = listOf(),
    @SerializedName("puggle")
    val puggle: List<AnyModel?>? = listOf(),
    @SerializedName("pyrenees")
    val pyrenees: List<AnyModel?>? = listOf(),
    @SerializedName("redbone")
    val redbone: List<AnyModel?>? = listOf(),
    @SerializedName("retriever")
    val retriever: List<String?>? = listOf(),
    @SerializedName("ridgeback")
    val ridgeback: List<String?>? = listOf(),
    @SerializedName("rottweiler")
    val rottweiler: List<AnyModel?>? = listOf(),
    @SerializedName("saluki")
    val saluki: List<AnyModel?>? = listOf(),
    @SerializedName("samoyed")
    val samoyed: List<AnyModel?>? = listOf(),
    @SerializedName("schipperke")
    val schipperke: List<AnyModel?>? = listOf(),
    @SerializedName("schnauzer")
    val schnauzer: List<String?>? = listOf(),
    @SerializedName("segugio")
    val segugio: List<String?>? = listOf(),
    @SerializedName("setter")
    val setter: List<String?>? = listOf(),
    @SerializedName("sharpei")
    val sharpei: List<AnyModel?>? = listOf(),
    @SerializedName("sheepdog")
    val sheepdog: List<String?>? = listOf(),
    @SerializedName("shiba")
    val shiba: List<AnyModel?>? = listOf(),
    @SerializedName("shihtzu")
    val shihtzu: List<AnyModel?>? = listOf(),
    @SerializedName("spaniel")
    val spaniel: List<String?>? = listOf(),
    @SerializedName("spitz")
    val spitz: List<String?>? = listOf(),
    @SerializedName("springer")
    val springer: List<String?>? = listOf(),
    @SerializedName("stbernard")
    val stbernard: List<AnyModel?>? = listOf(),
    @SerializedName("terrier")
    val terrier: List<String?>? = listOf(),
    @SerializedName("tervuren")
    val tervuren: List<AnyModel?>? = listOf(),
    @SerializedName("vizsla")
    val vizsla: List<AnyModel?>? = listOf(),
    @SerializedName("waterdog")
    val waterdog: List<String?>? = listOf(),
    @SerializedName("weimaraner")
    val weimaraner: List<AnyModel?>? = listOf(),
    @SerializedName("whippet")
    val whippet: List<AnyModel?>? = listOf(),
    @SerializedName("wolfhound")
    val wolfhound: List<String?>? = listOf()
)