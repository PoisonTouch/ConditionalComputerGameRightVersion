package com.company;

public class ConditionalComputerGameRightVersion {
    public static int[] numberOfResources(int[] villageResources, int loadCapacity) {
        int storageOfProcessedElements = 0;//накопитель обработанных элементов
        int storageOfElementsDistribution = 0;//накопитель распределения элементов
        int sumVillageResources = 0; //всего ресурсов в деревне
        for (int r : villageResources) sumVillageResources += r; //нахождение общего количества ресурсов в деревне
        int[] stolenResources = new int[villageResources.length];//массив украденных ресурсов
        double distributionCoefficient = (double) loadCapacity / (double) sumVillageResources;//коэффициент распределения
        for (int i = 0; i < villageResources.length; i++)//цикл нахождения украденных ресурсов
        {
            stolenResources[i] = (int) ((villageResources[i] + storageOfProcessedElements) * distributionCoefficient - storageOfElementsDistribution);
            storageOfProcessedElements += villageResources[i];
            storageOfElementsDistribution += stolenResources[i];
        }
        return stolenResources;
    }
}
