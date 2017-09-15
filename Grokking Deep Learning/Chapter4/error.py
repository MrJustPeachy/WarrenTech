# PROGRAM NAME: error.py
# PROGRAM PURPOSE: Demonstrates error simply
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/22/2017

knob_weight = 0.5
input = 0.5
goal_prediction = 0.8

pred = input * knob_weight

error = round((pred - goal_prediction) ** 2, 3)  # Mean Squared Error

print(error)