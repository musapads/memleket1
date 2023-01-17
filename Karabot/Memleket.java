package Karabot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu;
import net.dv8tion.jda.api.interactions.components.selections.StringSelectMenu;
import net.dv8tion.jda.internal.interactions.component.SelectMenuImpl;

public class Memleket extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent ereignis) {
        EmbedBuilder bauplan1 = new EmbedBuilder();
        bauplan1.setTitle("Memleket:" +"\n"  +  "01 Adana - 20 Denizli");
        bauplan1.setColor(0xde180d);
        bauplan1.setAuthor("Merhaba");
        bauplan1.addField("Memleket rolleri", "\uD835\uDCE3\uD835\uDCFE\uD835\uDCFB\uD835\uDCF4\uD835\uDCF2\uD835\uDD02\uD835\uDCEE \n" + "\n" + "\uD835\uDD38\uD835\uDD5F\uD835\uDD65\uD835\uDD5A\uD835\uDD5C\uD835\uDD56\uD835\uDD5E\uD835\uDD52\uD835\uDD5D\uD835\uDD5A\uD835\uDD64\uD835\uDD65\uD835\uDD5A\uD835\uDD6B \uD835\uDD4B\uD835\uDD66\uD835\uDD63\uD835\uDD5C\uD835\uDD5A\uD835\uDD6A\uD835\uDD56\uD835\uDD5E", true);
        bauplan1.setThumbnail("https://cdn.discordapp.com/attachments/1022167375338029066/1025600854323105894/F61E4C56-9092-4176-BA26-F584C94DC7A9.jpg");
        bauplan1.setImage("https://c.tenor.com/K0O9ugpisV4AAAAC/cio-01adana.gif");

        EmbedBuilder bauplan2 = new EmbedBuilder();
        bauplan2.setTitle("Memleket:" + "\n" + "21 Diyarbakır - 40 Kırşehir");
        bauplan2.setColor(0xffffff);
        bauplan2.setAuthor("Merhaba");
        bauplan2.addField("Memleket rolleri", "Birbirimize kaynaşmamız için memleket rolleri icat ettik. \n" + "\n" + "Memleketinizi seçiniz ve hemşehrinizi bulunuz " + "\n" + "\n" + "ÇUKUR İSTANBUL'DA: ", true);
        bauplan2.setThumbnail("https://cdn.discordapp.com/attachments/1022167375338029066/1025600854323105894/F61E4C56-9092-4176-BA26-F584C94DC7A9.jpg");
        bauplan2.setImage("https://i.pinimg.com/originals/bc/6a/d6/bc6ad6f9ba25bcaab1dbe33ac987c714.gif");

        EmbedBuilder bauplan3 = new EmbedBuilder();
        bauplan3.setTitle("Memleket:" +"\n" + "41 Kocaeli - 60 Tokat");
        bauplan3.setColor(0x5c7cff);
        bauplan3.setAuthor("Merhaba");
        bauplan3.addField("Memleket rolleri", "Birbirimize kaynaşmamız için memleket rolleri icat ettik. \n" + "\n" + "Memleketinizi seçiniz ve hemşehrinizi bulunuz " + "\n" + "\n" + "RİZENİN ÇAYI: ", true);
        bauplan3.setThumbnail("https://cdn.discordapp.com/attachments/1022167375338029066/1025600854323105894/F61E4C56-9092-4176-BA26-F584C94DC7A9.jpg");
        bauplan3.setImage("https://thumbs.gfycat.com/DigitalUnsightlyBarebirdbat-size_restricted.gif");

        EmbedBuilder bauplan4 = new EmbedBuilder();
        bauplan4.setTitle("Memleket:" +"\n" + "61 Trabzon - 81 Düzce");
        bauplan4.setColor(0x12a15e);
        bauplan4.setAuthor("Merhaba");
        bauplan4.addField("Memleket rolleri", "Birbirimize kaynaşmamız için memleket rolleri icat ettik. \n" + "\n" + "Memleketinizi seçiniz ve hemşehrinizi bulunuz " + "\n" + "\n" + "TRABZONLU MAFYA BABALARI: ", true);
        bauplan4.setThumbnail("https://cdn.discordapp.com/attachments/1022167375338029066/1025600854323105894/F61E4C56-9092-4176-BA26-F584C94DC7A9.jpg");
        bauplan4.setImage("https://i.pinimg.com/originals/fe/f9/e8/fef9e85ad028e1e81460d5100c8e68dc.gif");

        //bauplan.setThumbnail("https://marmotamaps.com/de/fx/wallpaper/thumbnail/aiguilledudru.jpg");
        //bauplan.setImage("https://i.pinimg.com/originals/fe/f9/e8/fef9e85ad028e1e81460d5100c8e68dc.gif");

        if (ereignis.isFromGuild()) {
            if (ereignis.getMessage().getContentStripped().equals("!memleket")) {

                SelectMenu menu1 = StringSelectMenu.create("Memleket1")

                        .setPlaceholder ("Memleketini seç!")

                        .addOption("01 Adana", "01")
                        .addOption("02 Adıyaman", "02")
                        .addOption("03 Afyonkarahisar", "03")
                        .addOption("04 Ağrı", "04")
                        .addOption("05 Amasya", "05")
                        .addOption("06 Ankara", "06")
                        .addOption("07 Antalya", "07")
                        .addOption("08 Artvin", "08")
                        .addOption("09 Aydın", "09")
                        .addOption("10 Balıkesir", "10")
                        .addOption("11 Bilecik", "11")
                        .addOption("12 Bingöl", "12")
                        .addOption("13 Bitlis", "13")
                        .addOption("14 Bolu", "14")
                        .addOption("15 Burdur", "15")
                        .addOption("16 Bursa", "16")
                        .addOption("17 Çanakkale", "17")
                        .addOption("18 Çankırı", "18")
                        .addOption("19 Çorum", "19")
                        .addOption("20 Denizli", "20")
                        .build();

                ereignis.getChannel().sendMessageEmbeds(bauplan1.build()).setActionRow(menu1).queue();


                SelectMenu menu2 = StringSelectMenu.create("Memleket2")

                        .setPlaceholder("Memleketini seç!")
                        .addOption("21 Diyarbakır", "21")
                        .addOption("22 Edirne", "22")
                        .addOption("23 Elazığ", "23")
                        .addOption("24 Erzincan", "24")
                        .addOption("25 Erzurum", "25")
                        .addOption("26 Eskişehir", "26")
                        .addOption("27 Gaziantep", "27")
                        .addOption("28 Giresun", "28")
                        .addOption("29 Gümüşhane", "29")
                        .addOption("30 Hakkâri", "30")
                        .addOption("31 Hatay", "31")
                        .addOption("32 Isparta", "32")
                        .addOption("33 Mersin", "33")
                        .addOption("34 İstanbul", "34")
                        .addOption("35 İzmir", "35")
                        .addOption("36 Kars", "36")
                        .addOption("37 Kastamonu", "37")
                        .addOption("38 Kayseri", "38")
                        .addOption("39 Kırklareli", "39")
                        .addOption("40 Kırşehir", "40")
                        .build();
                ereignis.getChannel().sendMessageEmbeds(bauplan2.build()).setActionRow(menu2).queue();


                SelectMenu menu3 = StringSelectMenu.create("Memleket3")

                        .setPlaceholder("Memleketini seç!")
                        .addOption("41 Kocaeli", "41")
                        .addOption("42 Konya", "42")
                        .addOption("43 Kütahya", "43")
                        .addOption("44 Malatya", "44")
                        .addOption("45 Manisa", "45")
                        .addOption("46 Kahramanmaraş", "46")
                        .addOption("47 Mardin", "47")
                        .addOption("48 Muğla", "48")
                        .addOption("49 Muş", "49")
                        .addOption("50 Nevşehir", "50")
                        .addOption("51 Niğde", "51")
                        .addOption("52 Ordu", "52")
                        .addOption("53 Rize", "53")
                        .addOption("54 Sakarya", "54")
                        .addOption("55 Samsun", "55")
                        .addOption("56 Siirt", "56")
                        .addOption("57 Sinop", "57")
                        .addOption("58 Sivas", "58")
                        .addOption("59 Tekirdağ", "59")
                        .addOption("60 Tokat", "60")
                        .build();
                ereignis.getChannel().sendMessageEmbeds(bauplan3.build()).setActionRow(menu3).queue();


                SelectMenu menu4 = StringSelectMenu.create("Memleket4")

                        .setPlaceholder("Memleketini seç!")
                        .addOption("61 Trabzon", "61")
                        .addOption("62 Tunceli", "62")
                        .addOption("63 Şanlıurfa", "63")
                        .addOption("64 Uşak", "64")
                        .addOption("65 Van", "65")
                        .addOption("66 Yozgat", "66")
                        .addOption("67 Zonguldak", "67")
                        .addOption("68 Aksaray", "68")
                        .addOption("69 Bayburt", "69")
                        .addOption("70 Karaman", "70")
                        .addOption("71 Kırıkkale", "71")
                        .addOption("72 Batman", "72")
                        .addOption("73 Şırnak", "73")
                        .addOption("74 Bartın", "74")
                        .addOption("75 Ardahan", "75")
                        .addOption("76 Iğdır", "76")
                        .addOption("77 Yalova", "77")
                        .addOption("78 Karabük", "78")
                        .addOption("79 Kilis", "79")
                        .addOption("80 Osmaniye", "80")
                        .addOption("81 Düzce", "81")
                        .build();

                ereignis.getChannel().sendMessageEmbeds(bauplan4.build()).setActionRow(menu4).queue();

                System.out.println("sdadasasd");
            }
        }
    }

    public void onSelectMenuInteraction(StringSelectInteractionEvent ereignis1) {
        Role rolle = null;

        if (ereignis1.getSelectMenu().getId().equals("Memleket1")) {
            switch (ereignis1.getValues().get(0)) {
                case "01":
                    rolle = ereignis1.getGuild().getRoleById("1022436727509487658");
                    break;
                case "02":
                    rolle = ereignis1.getGuild().getRoleById("1022436855079256117");
                    break;
                case "03":
                    rolle = ereignis1.getGuild().getRoleById("1022437173062025246");
                    break;
                case "04":
                    rolle = ereignis1.getGuild().getRoleById("1022437321276145715");
                    break;
                case "05":
                    rolle = ereignis1.getGuild().getRoleById("1022437435948417034");
                    break;
                case "06":
                    rolle = ereignis1.getGuild().getRoleById("1022437525496795146");
                    break;
                case "07":
                    rolle = ereignis1.getGuild().getRoleById("1022437618794905703");
                    break;
                case "08":
                    rolle = ereignis1.getGuild().getRoleById("1022437699556216873");
                    break;
                case "09":
                    rolle = ereignis1.getGuild().getRoleById("1022437807010091049");
                    break;
                case "10":
                    rolle = ereignis1.getGuild().getRoleById("1022437849531953163");
                    break;
                case "11":
                    rolle = ereignis1.getGuild().getRoleById("1022437957828886528");
                    break;
                case "12":
                    rolle = ereignis1.getGuild().getRoleById("1022437961968652378");
                    break;
                case "13":
                    rolle = ereignis1.getGuild().getRoleById("1022437964309090324");
                    break;
                case "14":
                    rolle = ereignis1.getGuild().getRoleById("1022437965189877790");
                    break;
                case "15":
                    rolle = ereignis1.getGuild().getRoleById("1022437966016159754");
                    break;
                case "16":
                    rolle = ereignis1.getGuild().getRoleById("1022437967391891466");
                    break;
                case "17":
                    rolle = ereignis1.getGuild().getRoleById("1022437968083955763");
                    break;
                case "18":
                    rolle = ereignis1.getGuild().getRoleById("1022437968910221373");
                    break;
                case "19":
                    rolle = ereignis1.getGuild().getRoleById("1022437969212231712");
                    break;
                case "20":
                    rolle = ereignis1.getGuild().getRoleById("1022437970206265436");
                    break;
            }
            ereignis1.getGuild().addRoleToMember(ereignis1.getUser(), rolle).queue();
            ereignis1.reply("Canim Memleketim").setEphemeral(true).queue();
        }

        if (ereignis1.getSelectMenu().getId().equals("Memleket2")) {

            switch (ereignis1.getValues().get(0)) {
                case "21":
                    rolle = ereignis1.getGuild().getRoleById("1022437971074486322");
                    break;
                case "22":
                    rolle = ereignis1.getGuild().getRoleById("1022437971934318662");
                    break;
                case "23":
                    rolle = ereignis1.getGuild().getRoleById("1022437971951104001");
                    break;
                case "24":
                    rolle = ereignis1.getGuild().getRoleById("1022437972571852821");
                    break;
                case "25":
                    rolle = ereignis1.getGuild().getRoleById("1022437973389754429");
                    break;
                case "26":
                    rolle = ereignis1.getGuild().getRoleById("1022438859528753162");
                    break;
                case "27":
                    rolle = ereignis1.getGuild().getRoleById("1022438860057219142");
                    break;
                case "28":
                    rolle = ereignis1.getGuild().getRoleById("1022438861764313148");
                    break;
                case "29":
                    rolle = ereignis1.getGuild().getRoleById("1022438861776900106");
                    break;
                case "30":
                    rolle = ereignis1.getGuild().getRoleById("1022438862536060989");
                    break;
                case "31":
                    rolle = ereignis1.getGuild().getRoleById("1022438862821261342");
                    break;
                case "32":
                    rolle = ereignis1.getGuild().getRoleById("1022438863488172133");
                    break;
                case "33":
                    rolle = ereignis1.getGuild().getRoleById("1022438864092151882");
                    break;
                case "34":
                    rolle = ereignis1.getGuild().getRoleById("1022438865547571250");
                    break;
                case "35":
                    rolle = ereignis1.getGuild().getRoleById("1022438866369642526");
                    break;
                case "36":
                    rolle = ereignis1.getGuild().getRoleById("1022438867447599114");
                    break;
                case "37":
                    rolle = ereignis1.getGuild().getRoleById("1022438868080934942");
                    break;
                case "38":
                    rolle = ereignis1.getGuild().getRoleById("1022438868718452776");
                    break;
                case "39":
                    rolle = ereignis1.getGuild().getRoleById("1022438869506981948");
                    break;
                case "40":
                    rolle = ereignis1.getGuild().getRoleById("1022438869506981948");
                    break;
            }
            ereignis1.getGuild().addRoleToMember(ereignis1.getUser(), rolle).queue();
            ereignis1.reply("Canim Memleketim").setEphemeral(true).queue();
        }

        if (ereignis1.getSelectMenu().getId().equals("Memleket3")) {

            switch (ereignis1.getValues().get(0)) {
                case "41":
                    rolle = ereignis1.getGuild().getRoleById("1022438869905440781");
                    break;
                case "42":
                    rolle = ereignis1.getGuild().getRoleById("1022438871314743316");
                    break;
                case "43":
                    rolle = ereignis1.getGuild().getRoleById("1022438872652718100");
                    break;
                case "44":
                    rolle = ereignis1.getGuild().getRoleById("1022438872749199420");
                    break;
                case "45":
                    rolle = ereignis1.getGuild().getRoleById("1022438873512558642");
                    break;
                case "46":
                    rolle = ereignis1.getGuild().getRoleById("1022438873755824140");
                    break;
                case "47":
                    rolle = ereignis1.getGuild().getRoleById("1022438875110580306");
                    break;
                case "48":
                    rolle = ereignis1.getGuild().getRoleById("1022438875832008756");
                    break;
                case "49":
                    rolle = ereignis1.getGuild().getRoleById("1022438876490506290");
                    break;
                case "50":
                    rolle = ereignis1.getGuild().getRoleById("1022438877190950942");
                    break;
                case "51":
                    rolle = ereignis1.getGuild().getRoleById("1022440416034963498");
                    break;
                case "52":
                    rolle = ereignis1.getGuild().getRoleById("1022440418358603786");
                    break;
                case "53":
                    rolle = ereignis1.getGuild().getRoleById("1022440418945814620");
                    break;
                case "54":
                    rolle = ereignis1.getGuild().getRoleById("1022440421118459914");
                    break;
                case "55":
                    rolle = ereignis1.getGuild().getRoleById("1022440422154457128");
                    break;
                case "56":
                    rolle = ereignis1.getGuild().getRoleById("1022440423895076884");
                    break;
                case "57":
                    rolle = ereignis1.getGuild().getRoleById("1022440425530855454");
                    break;
                case "58":
                    rolle = ereignis1.getGuild().getRoleById("1022440427367956531");
                    break;
                case "59":
                    rolle = ereignis1.getGuild().getRoleById("1022440427787407402");
                    break;
                case "60":
                    rolle = ereignis1.getGuild().getRoleById("1022440429880352778");
                    break;
            }
            ereignis1.getGuild().addRoleToMember(ereignis1.getUser(), rolle).queue();
            ereignis1.reply("Canim Memleketim").setEphemeral(true).queue();
        }


        if (ereignis1.getSelectMenu().getId().equals("Memleket4")) {

            switch (ereignis1.getValues().get(0)) {
                case "61":
                    rolle = ereignis1.getGuild().getRoleById("1022440431654555748");
                    break;
                case "62":
                    rolle = ereignis1.getGuild().getRoleById("1022440433562947644");
                    break;
                case "63":
                    rolle = ereignis1.getGuild().getRoleById("1022440435169370123");
                    break;
                case "64":
                    rolle = ereignis1.getGuild().getRoleById("1022440436230524948");
                    break;
                case "65":
                    rolle = ereignis1.getGuild().getRoleById("1022440438042460240");
                    break;
                case "66":
                    rolle = ereignis1.getGuild().getRoleById("1022440440001200169");
                    break;
                case "67":
                    rolle = ereignis1.getGuild().getRoleById("1022440442022871130");
                    break;
                case "68":
                    rolle = ereignis1.getGuild().getRoleById("1022440442672980020");
                    break;
                case "69":
                    rolle = ereignis1.getGuild().getRoleById("1022441388006182912");
                    break;
                case "70":
                    rolle = ereignis1.getGuild().getRoleById("1022441388496920707");
                    break;
                case "71":
                    rolle = ereignis1.getGuild().getRoleById("1022441390526976050");
                    break;
                case "72":
                    rolle = ereignis1.getGuild().getRoleById("1022441390547943445");
                    break;
                case "73":
                    rolle = ereignis1.getGuild().getRoleById("1022441391852363866");
                    break;
                case "74":
                    rolle = ereignis1.getGuild().getRoleById("1022441391869136947");
                    break;
                case "75":
                    rolle = ereignis1.getGuild().getRoleById("1022441392905138176");
                    break;
                case "76":
                    rolle = ereignis1.getGuild().getRoleById("1022441393785933824");
                    break;
                case "77":
                    rolle = ereignis1.getGuild().getRoleById("1022441394658349097");
                    break;
                case "78":
                    rolle = ereignis1.getGuild().getRoleById("1022441395056820224");
                    break;
                case "79":
                    rolle = ereignis1.getGuild().getRoleById("1022441395056820224");
                    break;
                case "80":
                    rolle = ereignis1.getGuild().getRoleById("1022441434579750922");
                    break;
                case "81":
                    rolle = ereignis1.getGuild().getRoleById("1022441437129887764");
                    break;

            }
            ereignis1.getGuild().addRoleToMember(ereignis1.getUser(), rolle).queue();
            ereignis1.reply("Canim Memleketim").setEphemeral(true).queue();
        }
    }
}
