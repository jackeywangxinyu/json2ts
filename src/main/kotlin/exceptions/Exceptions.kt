package exceptions


import java.io.IOException

class SyntaxException: Exception("Wrong json syntax")

class FileIOException: IOException("Cannot read or write file")
