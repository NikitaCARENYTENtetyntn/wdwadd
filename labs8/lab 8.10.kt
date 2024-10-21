fun repeatStringRecursive(txt: String, times: Int): String {
    if (times <= 0) return ""
    else return txt + repeatStringRecursive(txt, times - 1)
}
