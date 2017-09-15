# PROGRAM NAME: hidden_nn.py
# PROGRAM PURPOSE: Create a hidden layer with numpy
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/18/2017

import numpy as np

ih_wgt = np.array([
                    [0.1, 0.2, -0.1],
                    [-0.1, 0.1, 0.9],
                    [0.1, 0.4, 0.1]
                    ])

hp_wgt = np.array([
                    [0.3, 1.1, -0.3],
                    [0.1, 0.2, 0.0],
                    [0.0, 1.3, 0.1]
                    ])

weights = [ih_wgt, hp_wgt]

def neural_network(input, weights):

    hidden = input.dot(weights[0])
    pred = hidden.dot(weights[1])
    return pred

toes = np.array([8.5, 9.5, 9.9, 9.0])
wlrec = np.array([0.65, 0.8, 0.8, 0.9])
nfans = np.array([1.2, 1.3, 0.5, 1.0])

input = np.array([toes[0], wlrec[0], nfans[0]])

pred = neural_network(input, weights)
print(pred)