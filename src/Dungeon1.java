import java.util.Scanner;

import javax.sound.sampled.Clip;
public class Dungeon1 extends Story{


    public void dunGeon1(int x, My my, Enemy enemy, Enemy enemy2, Enemy enemy3, Enemy enemy4,Reward_1 reward1, Shop shop, Bgm bgm) {//나중에 int형 반환으로 바꿔서 던전 2입장여부 조사

        int select=0;
        int tutorial_token=0;
        Scanner scan= new Scanner(System.in);

        if (x == 1) {
            my.fhp=80;
            my.hp=80;
            enemy.fhp=40;
            enemy.hp=40;
            enemy4.fhp = 0;
            enemy4.hp = 0;
            enemy3.fhp = 0;
            enemy3.hp = 0;
            enemy2.fhp = 0;
            enemy2.hp = 0;
            enemy.enemy_name[0]="좀비";

            my.mycard();//초기카드 선언
        }else if(x==2) {
            enemy.fhp=30;
            enemy.hp=30;
            enemy2.fhp = 40;
            enemy2.hp = 40;
            enemy3.fhp = 0;
            enemy3.hp = 0;
            enemy4.fhp = 0;
            enemy4.hp = 0;
            my.power=0;
            enemy.weak=0;
            enemy.enemy_name[0]="여성좀비";
            enemy.enemy_name[1]="뱀파이어";
        }else if(x==3){
            enemy.fhp=0;
            enemy.hp=0;
            enemy2.fhp = 40;
            enemy2.hp = 40;
            enemy3.fhp = 60;
            enemy3.hp = 60;
            enemy4.fhp = 0;
            enemy4.hp = 0;
            my.power=0;
            enemy.weak=0;
            enemy.enemy_name[1]="하수구고블린";
            enemy.enemy_name[2]="에일리언";

        }else if(x==4){
            //my.fhp=80;
            //my.hp=80;
            //my.mycard();//초기카드 선언
            enemy.fhp=0;
            enemy.hp=0;
            enemy3.fhp = 0;
            enemy3.hp = 0;
            enemy2.fhp = 0;
            enemy2.hp = 0;
            enemy4.fhp = 80;
            enemy4.hp = 80;
            my.power=0;
            enemy.weak=0;
            enemy.enemy_name[3]="모르고스";
            System.out.println("\n" +
                    " ▄▀▀█▄▄   ▄▀▀▀▀▄   ▄▀▀▀▀▄  ▄▀▀▀▀▄      ▄▀▀▀▀▄  ▄▀▀▀█▀▀▄  ▄▀▀█▄   ▄▀▀▀▀▄   ▄▀▀█▄▄▄▄ \n" +
                    "▐ ▄▀   █ █      █ █ █   ▐ █ █   ▐     █ █   ▐ █    █  ▐ ▐ ▄▀ ▀▄ █        ▐  ▄▀   ▐ \n" +
                    "  █▄▄▄▀  █      █    ▀▄      ▀▄          ▀▄   ▐   █       █▄▄▄█ █    ▀▄▄   █▄▄▄▄▄  \n" +
                    "  █   █  ▀▄    ▄▀ ▀▄   █  ▀▄   █      ▀▄   █     █       ▄▀   █ █     █ █  █    ▌  \n" +
                    " ▄▀▄▄▄▀    ▀▀▀▀    █▀▀▀    █▀▀▀        █▀▀▀    ▄▀       █   ▄▀  ▐▀▄▄▄▄▀ ▐ ▄▀▄▄▄▄   \n" +
                    "█    ▐             ▐       ▐           ▐      █         ▐   ▐   ▐         █    ▐   \n" +
                    "▐                                             ▐                           ▐        \n");

           // my.mycard();//초기카드 선언
        }else if(x==0){//tutorial
            my.fhp=80;
            my.hp=80;
            enemy.fhp=30;
            enemy.hp=30;
            enemy4.fhp = 0;
            enemy4.hp = 0;
            enemy3.fhp = 0;
            enemy3.hp = 0;
            enemy2.fhp = 0;
            enemy2.hp = 0;
            my.power=0;
            enemy.weak=0;
            enemy.enemy_name[0]="허수아비";
            my.mycard();//초기카드 선언
        }else if(x==5){
            enemy.fhp=30;
            enemy.hp=30;
            enemy4.fhp = 0;
            enemy4.hp = 0;
            enemy3.fhp = 35;
            enemy3.hp = 35;
            enemy2.fhp = 30;
            enemy2.hp = 30;
            my.power=0;
            enemy.weak=0;
            enemy.enemy_name[0]="엘프1";
            enemy.enemy_name[1]="엘프2";
            enemy.enemy_name[2]="엘프3";
            //my.mycard();//초기카드 선언
        }
        else if(x==6){
            enemy.fhp=30;
            enemy.hp=30;
            enemy4.fhp = 0;
            enemy4.hp = 0;
            enemy3.fhp = 40;
            enemy3.hp = 40;
            enemy2.fhp = 30;
            enemy2.hp = 30;
            my.power=0;
            enemy.weak=0;
            enemy.enemy_name[0]="도깨비1";
            enemy.enemy_name[1]="도깨비2";
            enemy.enemy_name[2]="도깨비3";
            //my.mycard();//초기카드 선언
        }else if(x==7){//goliath atk: 20~30
            enemy.fhp=100;
            enemy.hp=100;
            enemy4.fhp = 0;
            enemy4.hp = 0;
            enemy3.fhp = 0;
            enemy3.hp = 0;
            enemy2.fhp = 0;
            enemy2.hp = 0;
            my.power=0;
            enemy.weak=0;
            enemy.enemy_name[0]="골리앗";
            my.goliath=1;
            //my.mycard();//초기카드 선언
            System.out.println("\n" +
                    "   ▄██████▄   ▄██████▄   ▄█        ▄█     ▄████████     ███        ▄█    █▄    \n" +
                    "  ███    ███ ███    ███ ███       ███    ███    ███ ▀█████████▄   ███    ███   \n" +
                    "  ███    █▀  ███    ███ ███       ███▌   ███    ███    ▀███▀▀██   ███    ███   \n" +
                    " ▄███        ███    ███ ███       ███▌   ███    ███     ███   ▀  ▄███▄▄▄▄███▄▄ \n" +
                    "▀▀███ ████▄  ███    ███ ███       ███▌ ▀███████████     ███     ▀▀███▀▀▀▀███▀  \n" +
                    "  ███    ███ ███    ███ ███       ███    ███    ███     ███       ███    ███   \n" +
                    "  ███    ███ ███    ███ ███▌    ▄ ███    ███    ███     ███       ███    ███   \n" +
                    "  ████████▀   ▀██████▀  █████▄▄██ █▀     ███    █▀     ▄████▀     ███    █▀    \n" +
                    "                        ▀                                                      \n");
        }

        //출력
        do {
            if(x==0&&tutorial_token==0){
                System.out.println("                      왼쪽이 당신, 오른쪽이 당신의 적 입니다.");
                System.out.println("                    카드 번호를 입력해 공격이나 방어를 하십시오");
                System.out.println("         카드이름 우측의 숫자는 카드를 사용하는 데 드는 에너지를 의미합니다.");
                System.out.println("                    적 우측의 \uD83D\uDD2A은 적의 공격력을 의미합니다.");
                System.out.println("                    에너지가 0이 될 때까지 전투를 진행하십시오");
                tutorial_token++;
            }
            //1번째 선물 유무
            if(my.gift1==1){
                my.energy=4;
            }else{
            my.energy=3;
            }
            if (my.gift2 == 2) {
                my.defend=10;
            }else{
                my.defend=0;
            }
            if(my.gift3==3){
                if(my.hp<=75) {
                    my.hp += 5;
                }else{
                    my.hp=80;
                }
            }else{
            }
            //2번째 선물 유무
            if(my.gift2_1<=2){
                my.defend=999;
                my.gift2_1++;
            }
            //튜토리얼 에너지 2
            if(x==0) my.energy=2;

            //던전 출력
            System.out.println("\n\n\n\n");
            do {
                System.out.printf("\uD83E\uDDCD                                                                    ");
                if(x==1&&enemy.hp>0){
                System.out.printf("\uD83E\uDDDF(\uD83D\uDD2A: %d) ", enemy.atk_save);}
                if(x==2){
                    if(enemy.hp>0){
                        System.out.printf("\uD83E\uDDDF\u200D♀\uFE0F(\uD83D\uDD2A: %d)    \t\t ", enemy.atk_save);}
                    if(enemy2.hp>0){
                    System.out.printf("\uD83E\uDDDB(\uD83D\uDD2A: %d)", enemy2.atk_save);}
                }else if(x==3){//진행중
                    if(enemy2.hp>0){
                        System.out.printf("\uD83D\uDC7E(\uD83D\uDD2A: %d)    \t\t ", enemy2.atk_save);}
                    if(enemy3.hp>0){
                        System.out.printf("\uD83D\uDC7D(\uD83D\uDD2A: %d)", enemy3.atk_save);}
                }
                else if(x==4){
                    if(enemy4.hp>0){
                        System.out.printf("\uD83D\uDC32(\uD83D\uDD2A: %d)", enemy4.atk_save);}
                }else if(x==0){//tutorial 미완성
                    if(enemy.hp>0){
                        System.out.printf("\uD83D\uDC07(\uD83D\uDD2A: %d)", enemy.atk_save);}
                }else if(x==5){
                    if(enemy.hp>0){
                        System.out.printf("\uD83E\uDDDD(\uD83D\uDD2A: %d)    \t\t ", enemy.atk_save);
                    }
                    if(enemy2.hp>0){
                        System.out.printf("\uD83E\uDDDD(\uD83D\uDD2A: %d)    \t\t ", enemy2.atk_save);
                    }
                    if(enemy3.hp>0){
                        System.out.printf("\uD83E\uDDDD(\uD83D\uDD2A: %d)", enemy3.atk_save);
                    }
                }else if(x==6){
                    if(enemy.hp>0){
                        System.out.printf("\uD83D\uDC79(\uD83D\uDD2A: %d)    \t\t ", enemy.atk_save);
                    }
                    if(enemy2.hp>0){
                        System.out.printf("\uD83D\uDC79(\uD83D\uDD2A: %d)    \t\t ", enemy2.atk_save);
                    }
                    if(enemy3.hp>0){
                        System.out.printf("\uD83D\uDC79(\uD83D\uDD2A: %d)", enemy3.atk_save);
                    }
                }else if(x==7){
                    if(enemy.hp>0){
                        System.out.printf("\uD83D\uDE08 (\uD83D\uDD2A: %d)    \t\t ", enemy.atk_save);
                    }
                }
                System.out.println();
                //내 체력바 출력
                my.myhp();
                System.out.print("\t\t\t\t\t\t\t\t\t");
                //적 체력바 출력
                if(x==1&&enemy.hp>0) {
                    enemy.enemyhp();
                }
                if(x==2){
                    if(enemy.hp>0){
                        enemy.enemyhp();
                    }
                    if(enemy2.hp>0) {
                        enemy2.enemyhp();
                    }
                }else if(x==3){
                    if(enemy2.hp>0) {
                        enemy2.enemyhp();
                    }
                    if(enemy3.hp>0) {
                        enemy3.enemyhp();
                    }
                }
                else if(x==4){
                    if(enemy4.hp>0) {
                        enemy4.enemyhp();
                    }
                }else if(x==0) {
                    if (enemy.hp > 0) {
                        enemy.enemyhp();
                    }
                }else if(x==5){
                    if (enemy.hp > 0) {
                        enemy.enemyhp();
                    }
                    if (enemy2.hp > 0) {
                        enemy2.enemyhp();
                    }
                    if (enemy3.hp > 0) {
                        enemy3.enemyhp();
                    }
                }else if(x==6){
                    if (enemy.hp > 0) {
                        enemy.enemyhp();
                    }
                    if (enemy2.hp > 0) {
                        enemy2.enemyhp();
                    }
                    if (enemy3.hp > 0) {
                        enemy3.enemyhp();
                    }
                }else if(x==7){
                    if(enemy.hp>0){
                        enemy.enemyhp();
                    }
                }
                System.out.println("\n==============================================================================");
                System.out.printf("\n\t\t\t\t\t\t\t\t【에너지:%d】\n\n", my.energy);
                //내 카드 출력 마이턴.
                my.mydeck(select); //패를 새로 뽑음. select 가 0 이어서
                if(x==0&&my.energy==0){
                    System.out.println("                 에너지가 0이 되었습니다. 0을 눌러 턴을 종료하세요");
                    System.out.println("         내 턴이 종료되면 내 카드에서 새로운 카드 5장을 무작위로 뽑습니다.");
                    System.out.println("                      또한 에너지가 다시 최대치로 회복됩니다.");
                    System.out.println("                          그리고 적의 공격이 시작됩니다.");
                }
                /*
                for(int i=0; i<100; i++) {
                    System.out.print(my.mycard[i]);
                }
                System.out.println();
                for(int i=0; i<100; i++) {
                    System.out.print(my.mycard_y[i]);
                }
                for(int i=0; i<6; i++){
                    System.out.print(my.mydeck[i]);
                }*/
                select = scan.nextInt();
                my.cardchoice(select,x, enemy,enemy2,enemy3,enemy4,bgm);

            } while (select != 0&&enemy.hp>0||select != 0&&enemy2.hp>0||select != 0&&enemy3.hp>0||select != 0&&enemy4.hp>0);
            //적 공격후 상황 출력
            int savehp=my.hp;//일단 내 초기 체력 저장해놓음.
            if(enemy.hp>0||enemy2.hp>0||enemy3.hp>0||enemy4.hp>0) {
                if (enemy.hp > 0) {//적이 살앗으면 나에게 공격
                    enemy.enemyatk(my);
                    enemy.atk_save = enemy.enemypower( my);
                }
                if (enemy2.hp > 0) {
                    enemy2.enemyatk(my);
                    enemy2.atk_save = enemy2.enemypower(my);
                }
                if (enemy3.hp > 0) {
                    enemy3.enemyatk(my);
                    enemy3.atk_save = enemy3.enemypower(my);
                }
                if (enemy4.hp > 0) {
                    enemy4.enemyatk(my);
                    enemy4.atk_save = enemy4.enemypower(my);
                }
                System.out.printf("\n\t\t\t\t\t  \uD83E\uDE78적에게 %d 데미지를 받았습니다.\uD83E\uDE78", savehp - my.hp);
                bgm.bgm(8);
                my.card_16_atk=savehp - my.hp;
            } else{//적이 죽었으면
                my.card_16_atk=0;
                if (x == 0) {
                    bgm.bgm(7);
                    System.out.println("축하합니다!");
                    System.out.println("토끼를 쓰려뜨렸습니다!");
                    System.out.println("이제 당신은 적과 맞서 싸울 준비가 되었습니다!\n\n");
                }
                if(x!=0&&x!=7) {
                    bgm.stopBgm();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n" +
                            " ██████╗██╗     ███████╗ █████╗ ██████╗ ██╗██╗\n" +
                            "██╔════╝██║     ██╔════╝██╔══██╗██╔══██╗██║██║\n" +
                            "██║     ██║     █████╗  ███████║██████╔╝██║██║\n" +
                            "██║     ██║     ██╔══╝  ██╔══██║██╔══██╗╚═╝╚═╝\n" +
                            "╚██████╗███████╗███████╗██║  ██║██║  ██║██╗██╗\n" +
                            " ╚═════╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝╚═╝\n" +
                            "                                              \n");
                    bgm.bgm(7);
                    //보상얻기

                    reward1.reward(1, my);//골드받고 카드 3중 1 선택// 정수값 1 받으면 골드 및 선택 문구 출력
                    while (true) {
                        select = scan.nextInt();
                        if (select == 1) {
                            my.mycard_plus(1, reward1);
                            break;
                        } else if (select == 2) {
                            my.mycard_plus(2, reward1);
                            break;
                        } else if (select == 3) {
                            my.mycard_plus(3, reward1);
                            break;
                        } else {
                            System.out.println("잘못 입력된 값입니다.");
                        }
                    }
                    //상점으로 갈래? 싸우러갈래?
                    if (x != 4 && x != 6) {//보스전, 골리앗 전 때 상점 안나옴
                        shop.shop_choice(reward1, my, bgm);
                    }
                }
                //상점 카드 버리기, 카드 구매, hp회복 기능
                //이벤트 확률적으로 출현
            }
            if(my.hp<0){//내가 죽엇으면
                my.card_16_atk=0;
                bgm.stopBgm();
                System.out.println("\n\n" +
                        " ██████╗  █████╗ ███╗   ███╗███████╗ ██████╗ ██╗   ██╗███████╗██████╗ \n" +
                        "██╔════╝ ██╔══██╗████╗ ████║██╔════╝██╔═══██╗██║   ██║██╔════╝██╔══██╗\n" +
                        "██║  ███╗███████║██╔████╔██║█████╗  ██║   ██║██║   ██║█████╗  ██████╔╝\n" +
                        "██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n" +
                        "╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n" +
                        " ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝ ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝\n" +
                        "                                                                      \n");
                bgm.bgm(6);
            }

        }while(my.hp>0&&enemy.hp>0||my.hp>0&&enemy2.hp>0||my.hp>0&&enemy3.hp>0||my.hp>0&&enemy4.hp>0);//스테이지 1반복 둘 다 살았다면,
    }
}
