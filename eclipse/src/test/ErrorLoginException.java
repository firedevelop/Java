package test;

// Definición de la excepción personalizada para errores de login
class ErrorLoginException extends Exception {
    String sms;

    // Constructor por defecto con un mensaje predefinido
    public ErrorLoginException() {
        this.sms = "El usuario o contraseña no son válidos";
    }

    // Constructor que permite personalizar el mensaje de error
    public ErrorLoginException(String sms) {
        this.sms = sms;
    }

    @Override
    public String getMessage() {
        return sms;
    }
}
