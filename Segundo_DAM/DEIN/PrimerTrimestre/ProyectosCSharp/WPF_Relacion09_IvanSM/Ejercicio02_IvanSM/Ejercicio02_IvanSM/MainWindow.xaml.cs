﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Xml.Serialization;

namespace Ejercicio02_IvanSM
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void calcular(object sender, RoutedEventArgs e)
        {   
            double capital = Convert.ToDouble(txtBoxCapital.Text);
            double interes = Convert.ToDouble(txtBoxInteres.Text);
            int plazo = Convert.ToInt32(txtBoxPlazo.Text);

            double resultado = (capital + (capital * interes / 100))/ plazo;

            txtBoxResultado.Text = Convert.ToString(resultado);

        }
    }
}
