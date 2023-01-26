using System;
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

namespace T01_ListBox_IvanSM
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        List<Tarea> items = new List<Tarea>();
        public MainWindow()
        {
            InitializeComponent();
            
        }

        private void agregarTarea (object sender, RoutedEventArgs e)
        {
            ListaTareas lt = new ListaTareas(); 
            items.Add(new Tarea() { Descripcion = txtBoxDescripcion.Text, Prioridad = int.Parse(txtBoxPrioridad.Text) });
            lt.lbTareas.ItemsSource = items;
            lt.ShowDialog();

        }
    }
}
