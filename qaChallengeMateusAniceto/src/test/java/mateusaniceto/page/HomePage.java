package mateusaniceto.page;

import org.openqa.selenium.By;


public class HomePage extends BasePage {


    private static final By btnLogin =
        By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a");

    private static final By btnCart =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(3) > a");
    private static final By btnDeleteAccount =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a");

    private static final By btnContactUs =
            By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(9) > a");

    private static final By stylishDressImg =
            By.cssSelector("body > section:nth-child(3) > div.container > div.row > div.col-sm-9.padding-right > div.features_items > div:nth-child(6) > div > div.single-products > div.productinfo.text-center > img");

    private static final By beautifulPeacockBlueCottonImg =
            By.cssSelector("body > section:nth-child(3) > div.container > div.row > div.col-sm-9.padding-right > div.features_items > div:nth-child(34) > div > div.single-products > div.productinfo.text-center > img");

    private static final By menTshirtImg =
            By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div > div.single-products > div.productinfo.text-center > img");
    private static final By btnAdicionarStylishDress =
            By.cssSelector("body > section:nth-child(3) > div.container > div.row > div.col-sm-9.padding-right > div.features_items > div:nth-child(6) > div > div.single-products > div.product-overlay > div > a");

    private static final By btnAdicionarBeautifulPeacock =
            By.cssSelector("body > section:nth-child(3) > div.container > div.row > div.col-sm-9.padding-right > div.features_items > div:nth-child(34) > div > div.single-products > div.product-overlay > div > a");

    private static final By btnAdicionarMenTshirt =
            By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div > div.single-products > div.product-overlay > div > a");
    private static final By btnContinuarComprando =
            By.cssSelector("#cartModal > div > div > div.modal-footer > button");


    public static void clicarBtnLogin(){
        clicar(btnLogin);
    }

    public static void clicarBtnCart() {
        scroll(btnCart);
        clicar(btnCart);
    }

    public static void adicionarStylishDress(int quantidade) {
        scroll(stylishDressImg);
        for(int i = 0; i < quantidade; i++) {
            hover(stylishDressImg);
            esperarElementoSerClicavel("body > section:nth-child(3) > div.container > div.row > div.col-sm-9.padding-right > div.features_items > div:nth-child(6) > div > div.single-products > div.product-overlay > div > a");
            clicar(btnAdicionarStylishDress);
            esperarElementoSerClicavel("#cartModal > div > div > div.modal-footer > button");
            clicar(btnContinuarComprando);
        }
    }

    public static void adicionarBeautifulPeacock(int quantidade) {
        scroll(beautifulPeacockBlueCottonImg);
        for(int i = 0; i< quantidade; i++){
            hover(beautifulPeacockBlueCottonImg);
            esperarElementoSerClicavel("body > section:nth-child(3) > div.container > div.row > div.col-sm-9.padding-right > div.features_items > div:nth-child(34) > div > div.single-products > div.product-overlay > div > a");
            clicar(btnAdicionarBeautifulPeacock);
            esperarElementoSerClicavel("#cartModal > div > div > div.modal-footer > button");
            clicar(btnContinuarComprando);
        }
    }

    public static void adicionarMenTshirt(int quantidade) {
        scroll(menTshirtImg);
        for(int i = 0; i < quantidade; i++){
            hover(menTshirtImg);
            esperarElementoSerClicavel("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div.features_items > div:nth-child(4) > div > div.single-products > div.product-overlay > div > a");
            clicar(btnAdicionarMenTshirt);
            esperarElementoSerClicavel("#cartModal > div > div > div.modal-footer > button");
            clicar(btnContinuarComprando);
        }
    }

    public static void clicarBtnContactUs(){
        scroll(btnContactUs);
        clicar(btnContactUs);
    }

    public static void clicarBtnDeletarConta(){
        clicar(btnDeleteAccount);
    }
}
