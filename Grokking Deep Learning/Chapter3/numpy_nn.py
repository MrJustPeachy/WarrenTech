# PROGRAM NAME: numpy_nn.py
# PROGRAM PURPOSE: Create multiple_nn.py using numpy
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/16/2017

import numpy as np

weights = np.array([0.1, 0.2, 0])


def neural_network(inputs, weights):

    pred = input.dot(weights)
    return pred

toes = np.array([8.5, 9.5, 9.9, 9.0])
wlrec = np.array([0.65, 0.8, 0.8, 0.9])
nfans = np.array([1.2, 1.3, 0.5, 1.0])

results = []

for i in range(len(toes)):

    input = np.array([toes[i], wlrec[i], nfans[i]])
    pred = neural_network(input, weights)
    results.append(round(pred, 3))

print(results)