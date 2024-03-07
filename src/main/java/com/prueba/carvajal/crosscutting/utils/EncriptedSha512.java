package com.prueba.carvajal.crosscutting.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


/**
 * Clase para realizar el metodo de incriptacion SHA512
 *
 * @author miguel.moreno
 * @since 07/03/2024
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EncriptedSha512 {

    private static final String SHA512 = "SHA-512";

    public static String encryptSHA512(String password) throws NoSuchAlgorithmException {

        /**
         *
         * Invoke the domain class (EncryptPassword)
         *
         *
         *
         * @header Envia password string
         *
         * @return String passwordEncripted
         *
         * @throws Exception
         *
         * @throws java.security.NoSuchAlgorithmException controlador de excepcion
         *
         */

        MessageDigest md = MessageDigest.getInstance(SHA512);

        String toReturn = "";
        md.reset();
        md.update(password.getBytes(StandardCharsets.UTF_8));
        toReturn = String.format("%0128x", new BigInteger(1, md.digest()));

        return toReturn;


    }
}
