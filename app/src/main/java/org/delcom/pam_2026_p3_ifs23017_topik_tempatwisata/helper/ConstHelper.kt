package org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.helper

class ConstHelper {
    // Route Names
    enum class RouteNames(val path: String) {
        Home(path = "home"),
        Profile(path = "profile"),
        Plants(path = "plants"),
        PlantsDetail(path = "plants/{name}"),
    }
}