/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.view;

import java.util.Scanner;

/**
 *
 * @author Matricula - 23.2
 */
public class senha {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //Simulação de recuperação de senha
        String emailCadrastado ="exemplo@gmail.com";
        String senhacadrastada = "123456";
        //Pedido o email para recuperação de senha
        System.out.println("Digite o seu Email: ");
        String emailDigitando = input.nextLine();
        Object mailCadastrado = null;
        
        if (emailDigitado.equals(mailCadastrado)) {
            System.out.println("Email não encontrado. Verifique o email digitado e tente ");
        }else{
            //Enviando um email de recuperação de senha
            System.out.println("Um email de recuperação de senha foi enviado para o seu email.");
            
        }
            
    }
    
}
