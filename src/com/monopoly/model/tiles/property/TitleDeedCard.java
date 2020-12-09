package com.monopoly.model.tiles.property;

import com.monopoly.model.tiles.Action;

import java.io.Serializable;

public class TitleDeedCard implements Serializable {
    // TODO state si olacak
    // TODO Her state icin farkli action arraylistleri olacak
    // TODO Kendi state ini handle edecek hem owned hem de levellari icin state i olacak.
    // TODO reset methodu
    final double mortgageRemovalMultiplier = 1.1;
    Action[] propertyActions;

    String propertyName;
    int levelOneRent, levelTwoRent, levelThreeRent, levelFourRent, levelFiveRent;
    boolean isMortgaged;
    int upgradeLevel;
    int propertyValue;
    int mortgageValue;
    int upgradeCost;
    int mortgagedTurnNumber;
    ColorGroup colorGroup;



    public Action[] getPropertyActions() {
        return propertyActions;
    }

    public void setPropertyActions(Action[] propertyActions) {
        this.propertyActions = propertyActions;
    }

    public int getLevelFourRent() {
        return levelFourRent;
    }

    public void setLevelFourRent(int levelFourRent) {
        this.levelFourRent = levelFourRent;
    }

    public int getLevelFiveRent() {
        return levelFiveRent;
    }

    public void setLevelFiveRent(int levelFiveRent) {
        this.levelFiveRent = levelFiveRent;
    }

    public boolean isMortgaged() {
        return isMortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        isMortgaged = mortgaged;
    }

    public int getUpgradeLevel() {
        return upgradeLevel;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public int getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(int propertyValue) {
        this.propertyValue = propertyValue;
    }

    public int getMortgageValue() {
        return mortgageValue;
    }

    public void setMortgageValue(int mortgageValue) {
        this.mortgageValue = mortgageValue;
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public void setUpgradeCost(int upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    public int getMortgagedTurnNumber() {
        return mortgagedTurnNumber;
    }

    public void setMortgagedTurnNumber(int mortgagedTurnNumber) {
        this.mortgagedTurnNumber = mortgagedTurnNumber;
    }

    public ColorGroup getColorGroup() {
        return colorGroup;
    }

    public void setColorGroup(ColorGroup colorGroup) {
        this.colorGroup = colorGroup;
    }

    public double getMortgageRemovalMultiplier() {
        return mortgageRemovalMultiplier;
    }

    public void mortgage() {

    }

    public int mortgageRemovalPenalty() {
        return 0;
    }

    public void downgrade() {

    }

    public String getPropertyName() {
        return "";

    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public int getLevelOneRent() {
        return 0;

    }

    public void setLevelOneRent(int levelOneRent) {

    }

    public int getLevelTwoRent() {
        return 0;

    }

    public void setLevelTwoRent(int levelTwoRent) {

    }

    public int getLevelThreeRent() {
        return 0;
    }

    public void setLevelThreeRent(int levelThreeRent) {

    }


    public Action[] getPossibleActions() {
        return null;
    }
}
